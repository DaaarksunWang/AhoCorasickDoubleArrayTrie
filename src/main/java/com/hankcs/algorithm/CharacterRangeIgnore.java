package com.hankcs.algorithm;

/**
 * Created by wcx on 16/3/21.
 */
public class CharacterRangeIgnore implements AhoCorasickDoubleArrayTrie.IIgnore {

  private char first;
  private char last;

  public CharacterRangeIgnore(char first, char last) {
    this.first = first;
    this.last = last;
  }

  @Override
  public int length() {
    return 1;
  }

  @Override
  public int isIgnore(char[] c) {
    return this.first<= c[0] && this.last >= c[0] ? 1 : 0;
  }
}