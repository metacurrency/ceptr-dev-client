package org.ceptr.shell;

public enum SemanticType {

  SEM_TYPE_STRUCTURE(1),
  SEM_TYPE_SYMBOL(2),
  SEM_TYPE_PROCESS(3),
  SEM_TYPE_RECEPTOR(4),
  SEM_TYPE_PROTOCOL(5);
  
  private final int index;
  private SemanticType(int index) {
    this.index = index;
  }
  int asInt() {
    return index;
  }
}
