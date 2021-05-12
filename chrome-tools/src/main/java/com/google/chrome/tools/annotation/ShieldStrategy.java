package com.google.chrome.tools.annotation;

public enum  ShieldStrategy {

    USERNAME(s ->s.replaceAll("(\\s)\\s(\\s*)","$1*$2")),
    PHONE(s ->s.replaceAll("(\\d{3})\\d{4}(\\d{4})","$1****$2"));


    private final ShieldExecute shieldExecute;

    ShieldStrategy(ShieldExecute shieldExecute) {
        this.shieldExecute = shieldExecute;
    }

    public ShieldExecute getShieldExecute() {
        return shieldExecute;
    }
}
