package org.ceptr.shell;

public class CeptrContext {

  final int ceptrContextInt;
  public CeptrContext(int context) {
    ceptrContextInt = context;
  }
  
  int asInt() {
    return ceptrContextInt;
  }
}
