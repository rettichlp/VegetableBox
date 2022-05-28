package com.rettichlp.vegetablebox.base.text;

public class MessageHandler {

    private static final String NO_COMMUNICATIONS = Message.getBuilder()
            .of("Du hast keine Kommunikationsgeräte!").color(ColorCode.RED).advance()
            .create();

    public static String NO_COMMUNICATIONS_FFORCE = Message.getBuilder()
            .add(NO_COMMUNICATIONS)
            .space()
            .of("Wenn du die Nachricht trotzdem senden möchtest, nutze /fforce [Nachricht]").color(ColorCode.GRAY).advance()
            .create();

    public static String NO_COMMUNICATIONS_DFORCE = Message.getBuilder()
            .add(NO_COMMUNICATIONS)
            .space()
            .of("Wenn du die Nachricht trotzdem senden möchtest, nutze /dforce [Nachricht]").color(ColorCode.GRAY).advance()
            .create();

    public static String NO_COMMUNICATIONS_SFFORCE = Message.getBuilder()
            .add(NO_COMMUNICATIONS)
            .space()
            .of("Wenn du die Nachricht trotzdem senden möchtest, nutze /sfforce [Nachricht]").color(ColorCode.GRAY).advance()
            .create();
}