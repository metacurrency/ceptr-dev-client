package org.ceptr.shell;

public class CeptrLabel implements CharSequence {

  String label;
  public CeptrLabel(CharSequence label) {
    this.label = label.toString();
  }
  
  @Override
  public String toString() {
    return label;
  }

  @Override
  public int length() {
    return label.length();
  }

  @Override
  public char charAt(int index) {
    return label.charAt(index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return label.subSequence(start, end);
  }
}
