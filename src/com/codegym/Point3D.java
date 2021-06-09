package com.codegym;

public class Point3D extends Point2D {
    float z = 0.0f;

    public Point3D() {

    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float z, float x, float y) {
        super(x, y);
        this.z = z;
    }
    public float getZ(){
        return this.z;
    }
    public void setZ(float z){
        this.z =z;
    }
    public float[] getXYZ(){
        return new float[]{x,y,z};
    }
    public void setXYZ(float x,float y,float z){
        this.x =x;
        this.y=y;
        this.z=z;
    }
    public String toString(){
        return "arr xyz:"+this.x+", "+this.y+", "+this.z;
    }
}
