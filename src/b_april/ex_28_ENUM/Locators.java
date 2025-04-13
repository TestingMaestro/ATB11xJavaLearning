package b_april.ex_28_ENUM;

public enum Locators
{
    PAGE_BUTTON("#btn"),
    PAGE_INPUT("#input1");

    private final String locators;

    Locators(String locators)
    {
        this.locators = locators;
    }

    String getLocators()
    {
        return this.locators;
    }
}
