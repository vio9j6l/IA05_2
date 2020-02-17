/*
 Course: IST 311
 Semester: Spring 2020
 Instructor: Phil O'Connell (pxo4)
 Student: JiaJia Liu
 Email: JPL5840@psu.edu
 Assignment: IA05
*/

import org.omg.CORBA.Environment;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    //This will be the only instance of a Logger
    private static final Logger INSTANCE = new Logger();
    private String logFileName = "myLogFile.log";
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");

// Change the Logger() constructor to be private
// Logger() constructor is only available to Logger class itself
    private Logger() {
        File logFile = new File(logFileName);
        if (!logFile.isFile()) {
            try {
                logFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Logging to: " + logFile.getAbsolutePath());
    }

    public void log(String message) {
        try {
            String formattedDate = LocalDateTime.now().format(formatter);
            String fullMessage = System.lineSeparator() + formattedDate + " - " + message;

            // NOTE, this is not the best way.  But good enough for this assignment
            Files.write(Paths.get(logFileName), fullMessage.getBytes(), StandardOpenOption.APPEND);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //A getter for other classes to access of that instance of Logger
    public static final Logger getInstance() {
        return INSTANCE;
    }


}
