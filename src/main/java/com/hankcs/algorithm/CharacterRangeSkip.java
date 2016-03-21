package com.hankcs.algorithm;

/**
 * Created by wcx on 16/3/21.
 */
public class CharacterRangeSkip implements AhoCorasickDoubleArrayTrie.ISkippable {

  private char first;
  private char last;

  public CharacterRangeSkip(char first, char last) {
    this.first = first;
    this.last = last;
  }

  @Override
  public boolean isContinue(char c) {
    return this.first<= c && this.last >= c;
  }
}