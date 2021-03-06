package com.csu.dao.line;

import com.csu.domain.line.Line;
import sun.util.calendar.BaseCalendar;

import java.util.ArrayList;

/**
 * Created by Asus_ on 2016/9/13.
 */
public interface LineDAO {
    public int addLine(Line line);
    public int delLineByLineId(int lineId);
    public ArrayList<Line> searchLineByTrainId(int trainId);
    public ArrayList<Line> searchLineByStationName(String stationName);
    public Line getLineByLineId(int lineId);
    public int updateLine(Line line);
    public int getMaxLineId();
}
