package VKR.ScheduleManagement;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Класс для управления событием расписания
 */
public class EventSchedule {

    private String _nameEvent; // Имя события (низвание пары, урока и т.п.)
    private String _typeEvent; // Тип события (лекция, практика, собрание, концерт и т.д.)
    private String _placeEvent; // Место проведения мероприятия (аудитория, улица, корпус)
    private Date _timeEventBegin; // Время начала события
    private Date _timeEventEnd; // Время окончания события
    // TODO: преподователь

    private GregorianCalendar _calendar;

    // Конструкторы
    /**
     * Конструктор без параметров
     */
    public EventSchedule(){
        this._timeEventBegin = new Date();
        this._timeEventEnd = new Date();
    }

    /**
     * Конструктор с параметрами
     * @param _nameEvent Имя события
     * @param _typeEvent Тип события
     * @param _placeEvent Место проведения мероприятия
     * @param _timeEventBegin Время начала события
     * @param _timeEventEnd Время окончания события
     */
    public EventSchedule(String _nameEvent, String _typeEvent, String _placeEvent,
                         Date _timeEventBegin, Date _timeEventEnd){
        this._nameEvent = _nameEvent;
        this._typeEvent = _typeEvent;
        this._placeEvent = _placeEvent;
        this._timeEventBegin = _timeEventBegin;
        this._timeEventEnd = _timeEventEnd;
    }

    // Методы
    // Имя события
    public void SetNameEvent(String _nameEvent) {
        this._nameEvent = _nameEvent;
    }
    public String GetNameEvent() {
        return _nameEvent;
    }

    // Тип мероприятия
    public void SetTypeEvent(String _typeEvent) {
        this._typeEvent = _typeEvent;
    }
    public String GetTypeEvent() {
        return _typeEvent;
    }

    // Место проведения события
    public void SetPlaceEvent(String _placeEvent) {
        this._placeEvent = _placeEvent;
    }
    public String GetPlaceEvent() {
        return _placeEvent;
    }

    // Время начала событитя
    /**
     * Установка времени начала события
     * @param timeEventBegin type Date
     */
    public void SetTimeEventBegin(Date timeEventBegin) {
        if (timeEventBegin.getTime() > 86399999l){
            throw new Error("Incorrect format of the number _timeEventBegin");
        }
        else {
            this._timeEventBegin = timeEventBegin;
        }
    }

    /**
     * Установка времени начала события
     * @param h Часы
     * @param m Минуты
     */
    public void SetTimeEventBegin(int h, int m) {
        if ((h < 0) || (h > 23)){
            throw new Error("Incorrect format of the number h");
        }
        else if ((m < 0) || (m > 59)){
            throw new Error("Incorrect format of the number m");
        }
        else{
            this._timeEventBegin.setTime(h * 3600000 + m * 60000);
        }
    }

    /**
     * Установка времени начала события
     * @param t количество миллисекунд
     */
    public void SetTimeEventBegin(long t){
        if( (t < 0l) || (t > 86399999l) ){
           throw new Error("Incorrect format of the number t");
        }
        else{
            this._timeEventBegin.setTime(t);
        }
    }

    /**
     * Возвращает время начала события
     * @return Экземпляр класса Date
     */
    public Date GetTimeEventBegin() {
        return _timeEventBegin;
    }

    // Время окончания события
    //TODO: Дописать методы, как у TimeEventBegin
    public void SetTimeEventEnd(Date _timeEventEnd) {
        this._timeEventEnd = _timeEventEnd;
    }
    public Date GetTimeEventEnd() {
        return _timeEventEnd;
    }
}
