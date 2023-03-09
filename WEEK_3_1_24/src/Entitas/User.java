package Entitas;

import java.util.ArrayList;
import java.util.List;

public class User{

String name;
int vitamin, telur,lagu,netWorth;




public User(String name, int vitamin,  int lagu) {
    this.name = name;
    this.vitamin = vitamin;
    this.telur = 0;
    this.lagu = lagu;
    this.netWorth = 0;
    
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getVitamin() {
    return vitamin;
}
public void setVitamin(int vitamin) {
    this.vitamin = vitamin;
}
public int getTelur() {
    return telur;
}
public void setTelur(int telur) {
    this.telur = telur;
}
public int getLagu() {
    return lagu;
}
public void setLagu(int lagu) {
    this.lagu = lagu;
}
public int getNetWorth() {
    return netWorth;
}
public void setNetWorth(int netWorth) {
    this.netWorth = netWorth;
}




}