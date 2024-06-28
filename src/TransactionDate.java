import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TransactionDate {

    private LocalDateTime now;

    public TransactionDate() {
        now = LocalDateTime.now();
    }

    public String getDate(){
        return now.toLocalDate().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"));
    }
    public String getTime(){
        return now.toLocalTime().format(DateTimeFormatter.ofPattern("HH시 mm분 ss초"));
    }
}
