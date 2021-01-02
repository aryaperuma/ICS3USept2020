package oop;

public class JuiceConstructor {
	private int water;
    private int fruit;
    private int sugar;
    private int icecube;
    private String juicename;
 
    public int getWater() {
        return water;
    }
 
    public void setWater(int water) {
        this.water = water;
    }
 
    public int getFruit() {
        return fruit;
    }
 
    public void setFruit(int fruit) {
        this.fruit = fruit;
    }
 
    public int getSugar() {
        return sugar;
    }
 
    public void setSugar(int sugar) {
        this.sugar = sugar;
    }
 
    public int getIceCube() {
        return icecube;
    }
 
    public void setIceCube(int icecube) {
        this.icecube= icecube;
    }
 
    public String getJuiceName() {
        return juicename;
    }
 
    public void setJuiceName(String juicename) {
        this.juicename= juicename;
    }
 
    public String toString() {
        return "Cold" + juicename + "!!!!  [" + water + " ml of water, " + fruit + "as a fruit, " + sugar +
            " gm of sugar, " + icecube + " ml of " + juicename + "]\n";
    }
    public abstract class JuiceMaker {
    	 
        private JuiceConstructor juice;
     
        public JuiceConstructor getJuice() {
            return juice;
        }
     
        public void setJuice(JuiceConstructor juice) {
            this.juice = juice;
        }
     
        public final JuiceConstructor makeJuice() {
            setJuice(juice);
            setJuiceType();
            setWater();
            setFruit();
            setSugar();
            setIceCube();
            return juice;
        }
     
        abstract void setJuiceType();
     
        abstract void setWater();
     
        abstract void setFruit();
     
        abstract void setSugar();
     
        abstract void setIceCube();
     
        abstract JuiceConstructor createJuice();
     
    }
}

