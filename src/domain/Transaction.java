package domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Transaction {
    private String id;
    private Type type;
    private String accountNumber;
    private double amount;
    private LocalDateTime timeStamp;
    private String note;

    public Transaction(String id, String note, LocalDateTime timeStamp, double amount, String accountNumber, Type type) {
        this.id = id;
        this.note = note;
        this.timeStamp = timeStamp;
        this.amount = amount;
        this.accountNumber = accountNumber;
        this.type = type;
    }
}
