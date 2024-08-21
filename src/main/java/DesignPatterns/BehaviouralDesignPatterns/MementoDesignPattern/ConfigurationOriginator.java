package DesignPatterns.BehaviouralDesignPatterns.MementoDesignPattern;

public class ConfigurationOriginator {
    int height;
    int width;
    ConfigurationOriginator(int height, int width){
        this.height=height;
        this.width= width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    public ConfigurationMemento createSnapShot(){
        return new ConfigurationMemento(this.height,this.width);
    }

    public void restoreSnapShot(ConfigurationMemento configurationMemento){
        this.height = configurationMemento.height;
        this.width = configurationMemento.width;
    }
}
