package org.ceptr.shell;

public class SemanticId {

  public final CeptrContext context;
  public final SemanticType semtype;
  public final SemanticAddr id;
  
  public SemanticId(CeptrContext context, SemanticType semtype, SemanticAddr id) {
    this.context = context;
    this.semtype = semtype;
    this.id = id;
  }
}
