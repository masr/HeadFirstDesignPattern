package com.maosuhan.designpattern.builder;

public abstract class Builder {
  abstract void buildPartA();
  abstract void buildPartB();
  abstract Product getResult();
}
