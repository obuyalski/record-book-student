package com.company.utils;

import java.io.IOException;
import java.util.List;

/**
 * Created by Олег on 29.09.2016.
 */
public interface Handler {
    /**
     * Работает с файлами. Читает/пишет в файл
     */
    List read(String filename) throws IOException;

    void write(String filename);
}
