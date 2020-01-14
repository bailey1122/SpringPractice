package com.spr.spr4e.ch4;

public aspect CriticAspect {

    pointcut performance() : execution(* perform(..));

    after() : performance() {
        System.out.println(criticismEngine.getCriticism());
    }

    private CriticismEngine criticismEngine;

    public void setCriticismEngine(CriticismEngine criticismEngine) {
        this.criticismEngine = criticismEngine;
    }
}
