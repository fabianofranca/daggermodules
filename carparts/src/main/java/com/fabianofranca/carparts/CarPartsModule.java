package com.fabianofranca.carparts;

import com.fabianofranca.core.Motor;
import com.fabianofranca.core.Plate;
import com.fabianofranca.core.Rim;
import com.fabianofranca.core.Tire;
import com.fabianofranca.core.Wheel;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class CarPartsModule {

    @Binds
    public abstract Wheel bindDefaultWheel(DefaultWheel wheel);

    @Binds
    public abstract Tire bindGoodyear(Goodyear tire);

    @Binds
    public abstract Rim bindR15(R15 rim);

    @Binds
    public abstract Motor bindV8Motor(V8Motor motor);

    @Binds
    public abstract Plate bindBrazilianPlate(BrazilianPlate plate);
}