package fr.iut.nantes.quizzmovie.entite;

import io.jsonwebtoken.impl.crypto.MacProvider;

import java.security.Key;

/**
 * @version 1.0
 * @since 1.0
 */
public abstract class Constants {

    public static final Key key = MacProvider.generateKey();

    //<editor-fold desc="Key MongoDB">
    public static final String DB_GAMER_LOGIN = "_id";
    public static final String DB_GAMER_PWD = "pwd";
    public static final String DB_GAMER_GOOD_ANSWERS = "goodAnswers";
    public static final String DB_GAMER_ANSWERS = "answers";
    //</editor-fold>
}
