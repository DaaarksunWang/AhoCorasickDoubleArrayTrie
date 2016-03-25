package com.hankcs.algorithm;

/**
 * Created by wcx on 16/3/21.
 */
public class CharacterIgnore implements AhoCorasickDoubleArrayTrie.IIgnore {

  private char c;

  public CharacterIgnore(char c){
    this.c = c;
  }

  @Override
  public int length() {
    return 1;
  }

  @Override
  public int isIgnore(char[] c) {
    return c[0] == this.c ? 1 : 0;
  }
}
