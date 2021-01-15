package nullObject;

import strategy.Strategy;

public class OnFoot implements Strategy {

    @Override
    public Double calculateCosts(Double kilometersTraveled) {
        return 0D;
    }

}
