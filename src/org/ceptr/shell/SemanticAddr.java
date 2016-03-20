package org.ceptr.shell;

public class SemanticAddr {

  final int addrInt;
  public SemanticAddr(int addr) {
    addrInt = addr;
  }

  int asInt() {
    return addrInt;
  }
}
