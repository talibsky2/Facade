public class CNCMachine {
    Power power = new Power();
    Load load = new Load();
    Make make = new Make();
    Paint paint = new Paint();
       void process(){
           power.on();
           load.insertMaterial();
           load.loadMat(load);
           make.choice();
           make.makeFigure(make);
           paint.choice();
           paint.paintFigure(paint);
           load.outMaterial();
           power.off();
       }
}
