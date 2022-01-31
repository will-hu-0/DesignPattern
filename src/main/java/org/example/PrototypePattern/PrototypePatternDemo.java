package org.example.PrototypePattern;

import org.example.PrototypePattern.PrototypeFactory.ModelType;

/**
 * Created by will on 7/19/16.
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        try {
            String movieProtoType = PrototypeFactory.getInstance(ModelType.MOVIE).toString();
            System.out.println(movieProtoType);

            String albumProtoType = PrototypeFactory.getInstance(ModelType.ALBUM).toString();
            System.out.println(albumProtoType);

            String showProtoType = PrototypeFactory.getInstance(ModelType.SHOW).toString();
            System.out.println(showProtoType);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
