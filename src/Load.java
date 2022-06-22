public class Load {
    private boolean load = false;
    public boolean hasMaterial (){
        return load;
    }
    void insertMaterial (){
        System.out.println("Load ok");
        load = true;
    }
    void outMaterial (){
        System.out.println("Materials out off");
        load = false;
    }

    void loadMat(Load load){
        if (load.hasMaterial()){
            System.out.println("Ready to do a figure");
        }
        else {
            System.err.println("No load materials");
            Power powerOff = new Power();
            powerOff.off();
            System.exit(0);
        }
    }

}

