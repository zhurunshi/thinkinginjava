package pers.rush.intermediate._18_泛型_边界;

import java.util.List;

/**
 * 超能力
 * 
 * @author Rush
 * @date 2020/02/02
 */
interface SuperPower {}

interface XRayVision extends SuperPower {
    void seeThroughWalls();
}

interface SuperSmell extends SuperPower {
    void trackBySmell();
}

interface SuperHearing extends SuperPower {
    void hearSubtleNoises();
}

class SuperHero<POWER extends SuperPower> {
    POWER power;

    SuperHero(POWER power) {
        this.power = power;
    }

    POWER getPower() {
        return power;
    }
}

/**
 * 超级侦探
 * 
 * @author Rush
 * @date 2020/02/02
 */
class SuperSleuth<POWER extends XRayVision> extends SuperHero<POWER> {
    SuperSleuth(POWER power) {
        super(power);
    }

    void see() {
        power.seeThroughWalls();
    }
}

/**
 * 犬类英雄
 * 
 * @author Rush
 * @date 2020/02/02
 */
class CanineHero<POWER extends SuperHearing & SuperSmell> extends SuperHero<POWER> {
    CanineHero(POWER power) {
        super(power);
    }

    void hear() {
        power.hearSubtleNoises();
    }

    void smell() {
        power.trackBySmell();
    }
}

class SuperHearSmell implements SuperHearing, SuperSmell {
    @Override
    public void hearSubtleNoises() {

    }

    @Override
    public void trackBySmell() {

    }
}

class DogBoy extends CanineHero<SuperHearSmell> {
    public DogBoy() {
        super(new SuperHearSmell());
    }
}

public class EpicBattle {
    static <POWER extends SuperHearing> void useSuperHearing(
        SuperHero<POWER> hero) {
        hero.getPower().hearSubtleNoises();
    }
    static <POWER extends SuperHearing & SuperSmell> void superFind(
        SuperHero<POWER> hero) {
        hero.getPower().hearSubtleNoises();
        hero.getPower().trackBySmell();
    }
    public static void main(String[] args) {
        DogBoy db = new DogBoy();
        useSuperHearing(db);
        superFind(db);
        List<? extends SuperHearing> audioBoy;
    }
}
