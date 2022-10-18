package VKR.ScheduleManagement;

import java.util.ArrayList;

/**
 * Класс управления расписанием за 1 день
 */
public class DaySchedule {

    private ArrayList<EventSchedule> _eventsDayList; // Список событий за 1 день

    // Конструкторы
    /**
     * Конструктор без параметров
     */
    public DaySchedule(){
        this._eventsDayList = new ArrayList<EventSchedule>();
    }
    // TODO: добавить описание функции (первоначально создание копии существующего списка)
    public DaySchedule(ArrayList<EventSchedule> ListSchedule){
        this._eventsDayList = ListSchedule;
    }

    // Методы
    /**
     * Перезаписать список
     * @param _eventsDay Список EventSchedule
     */
    public void OverwritingEventDaysList(ArrayList<EventSchedule> _eventsDay) {
        this._eventsDayList = _eventsDay;
    }
    public ArrayList<EventSchedule> GetEventsDayList() {
        return this._eventsDayList;
    }

    /**
     * Добавить элемент в список eventsDayList
     * @param _EventSchedule Событие
     */
    public void AppendEventSchedule(EventSchedule _EventSchedule){
        this._eventsDayList.add(_EventSchedule);
    }

    /**
     * Получить событие расписания по индексу
     * @param index индекс
     * @return
     */
    public EventSchedule GetEventsDayByIndex(int index){
        return this._eventsDayList.get(index);
    }

    /**
     * Удалить событие по индексу
     * @param index
     */
    public void  RemoveEventsDayByIndex(int index){
        this._eventsDayList.remove(index);
    }

    /**
     * Удаление всего списка событий
     */
    public void  ClearEventsDayList(){
        this._eventsDayList.clear();
    }

    public Boolean SortEventList(){



        return true;
    }

    // TODO: удаление элемента, отчистка списка, сортировка по датам класса EventSchedule
    //  и добавить день недели или иную дату. ПРОТЕСТИРОВАТЬ РАБОТУ!!!!!
}
