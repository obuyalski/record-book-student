package com.company.users;

/**
 * Created by Олег on 29.09.2016.
 */
public class Teacher {
    private String name;
    private String sign;
    private String sub;
    private int numGroup;
    private int numSess;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSign() {
        return sign;
    }
    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getSub() {
        return sub;
    }
    public void setSub(String sub) {
        this.sub = sub;
    }

    public int getNumGroup() {
        return numGroup;
    }
    public void setNumGroup(int numGroup) {
        this.numGroup = numGroup;
    }

    public int getNumSess() {
        return numSess;
    }
    public void setNumSess(int numSess) {
        this.numSess = numSess;
    }

    public String toString() {
        return "Teachers{" +
                "name='" + name + '\'' +
                ", sign='" + sign + '\'' +
                 ", sub ='" + sub + '\'' +
                ", numGroup ='" + numGroup + '\'' +
                ", numSess='" + numSess + '\'' +
                '}';
    }

}
