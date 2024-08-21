package programs;

// Class name must be "Main"
// Libraries included:
// json simple, guava, apache commons lang3, junit, jmock

/*
Coding Assignment

====================================================
Design File System
====================================================

You are asked to design a file system that allows you to create new paths and associate them with different values.

The format of a path is one or more concatenated strings of the form: / followed by one or more lowercase English letters. For example, "/partior" and "/partior/problems" are valid paths while an empty string "" and "/" are not.

Implement the FileSystem class:

bool createPath(string path, int value) Creates a new path and associates a value to it if possible and returns true. Returns false if the path already exists or its parent path doesn't exist.

int get(string path) Returns the value associated with path or returns -1 if the path doesn't exist.

====================================================
Example 1:

Input:

    ["FileSystem","createPath","get"]
    [[],["/a",1],["/a"]]

Output:

    [null,true,1]

Explanation:

    FileSystem fileSystem = new FileSystem();

    fileSystem.createPath("/a", 1); // return true

    fileSystem.get("/a"); // return 1

====================================================
Example 2:

Input:

    ["FileSystem","createPath","createPath","get","createPath","get"]
    [[],["/some",1],["/some/code",2],["/some/code"],["/c/d",1],["/c"]]

Output:

    [null,true,true,2,false,-1]

Explanation:

    FileSystem fileSystem = new FileSystem();


    fileSystem.createPath("/some", 1); // return true

    fileSystem.createPath("/some/code", 2); // return true

    fileSystem.get("/some/code"); // return 2

    fileSystem.createPath("/c/d", 1); // return false because the parent path "/c" doesn't exist.

    fileSystem.get("/c"); // return -1 because this path doesn't exist.

====================================================
Implementation Structure:

    class FileSystem {
         public FileSystem() {
         }

         public boolean createPath(String path, int value) {
         }

         public int get(String path) {
         }
    }

    // Your FileSystem object will be instantiated and called as such:

    FileSystem obj = new FileSystem();

    boolean param_1 = obj.createPath(path,value);

    int param_2 = obj.get(path);
*/

import java.util.*;

class Main {

    public static void main(String[] args) {
        //  System.out.println("Hello, world!");
        FileSystem obj = new FileSystem();
        boolean param_3 = obj.createPath("/path",10);
        System.out.println(param_3);

        boolean param_1 = obj.createPath("/path/a",11);
        System.out.println(param_1);

        int param_2 = obj.get("/path/a");
        System.out.println(param_2);

    }

    static public class FileSystem {

        Map<String,Integer> pathMap;

        public FileSystem() {
            pathMap=new HashMap<>();
        }

        public boolean createPath(String inputPath, int value) {

            System.out.println(pathMap);

            if(!inputPath.contains("/")){
                return false;
            }

            List<String> pathList = Arrays.asList(inputPath.split("/"));
            if(pathList.size()>1){
                String tempPath="";
                int pathLengthChecker=1;
                for(String path : pathList){
                    tempPath+=path;
                    pathLengthChecker++;
                    if(!pathMap.containsKey(tempPath) && pathList.size()!=pathLengthChecker){
                        return false;
                    }
                    else if(pathList.size()==pathLengthChecker) {
                        pathMap.put(inputPath,value);
                        return true;
                    }
                }
            }
            pathMap.put(inputPath,value);
            return true;
        }


        public int get(String path) {

            if(pathMap.containsKey(path)){
                return pathMap.get(path);
            }
            return -1;
        }
    }


}
