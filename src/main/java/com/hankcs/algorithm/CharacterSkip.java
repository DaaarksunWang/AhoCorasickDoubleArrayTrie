package com.hankcs.algorithm;

/**
 * Created by wcx on 16/3/21.
 */
public class CharacterSkip implements AhoCorasickDoubleArrayTrie.ISkippable {

  private char c;

  public CharacterSkip(char c){
    this.c = c;
  }

  @Override
  public boolean isContinue(char c) {

    return c == this.c;
  }
}
