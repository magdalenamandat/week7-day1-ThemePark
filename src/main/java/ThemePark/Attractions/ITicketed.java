package ThemePark.Attractions;

import VisitorTest.Visitor;

public interface ITicketed {

    public double defaultPrice();

    public double priceFor(Visitor visitor);
}
