package example.cashcard;

public enum Cards {

  CARD_OWNER("CARD-OWNER");

  private final String value;

  Cards(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
