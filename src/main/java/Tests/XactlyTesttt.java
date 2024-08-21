package Tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class XactlyTesttt {
    public static void main(String[] args) {

        int []arr = {1,6,4,7,8,4};

        int desc = 0;
        int asc = 0;

        for (int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                if(desc>0){
                    System.out.println("not sorted");
                    break;
                }
                asc++;
            }
            if(arr[i]>arr[i+1]){
                desc++;
            }
        }

        if(asc== arr.length-1){
            System.out.println("its in asc");
        } else if (desc == arr.length-1){
            System.out.println("its in desc");
        } else {
            System.out.println("not sorted");
        }

        /*
        tree hashmap
        trie

         */



//        List<Tests.Employee> employeeList = new ArrayList<>();
//        List<Tests.Employee> removeEmp = new ArrayList<>();
//        final Integer id =12;
//
//        List<Tests.Employee> templist = employeeList.stream().filter(employee -> Objects.equals(employee.getManagerId(),id)).collect(Collectors.toList());
//
//
//        while(id!=null){
//            List<Tests.Employee> templist = employeeList.stream().filter(employee -> Objects.equals(employee.getEmpId(),id)).collect(Collectors.toList());
//            if (Objects.nonNull(templist) && Objects.nonNull(templist.get(0).getManagerId())) {
//                removeEmp.addAll(templist);
//                id = templist.get(0).getManagerId();
//            } else id=null;
//        }
//        employeeList.removeAll(removeEmp);
//
//        System.out.println("");
//       employeeList.stream().filter(emp-> {
//           if (Objects.equals(emp.getEmpId(),id)){
//               id = emp.getManagerId();
//           }
//       })
//
    }
}
