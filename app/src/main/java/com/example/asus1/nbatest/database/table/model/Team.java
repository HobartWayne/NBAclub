package com.example.asus1.nbatest.database.table.model;

import com.example.asus1.nbatest.database.table.TableModel;

import org.litepal.crud.DataSupport;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by ASUS1 on 2017/4/14.
 * The Team class is the model of table Team in LitePal
 * The column of the table Team is "name,league,season,coaches,fromYear,toYear,years,games,wins,loses,
 * championships" and a Arena object
 */

public class Team extends DataSupport implements TableModel{

    private int id;
    private String name;
    private String league;
    private String season;
    private String coaches;
    private int fromYear;
    private int toYear;
    private int years;
    private int games;
    private int wins;
    private int loses;
    private int championships;
    private int arena_id;
    private List<Player> playerList = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getCoaches() {
        return coaches;
    }

    public void setCoaches(String coaches) {
        this.coaches = coaches;
    }

    public int getFromYear() {
        return fromYear;
    }

    public void setFromYear(int fromYear) {
        this.fromYear = fromYear;
    }

    public int getToYear() {
        return toYear;
    }

    public void setToYear(int toYear) {
        this.toYear = toYear;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLoses() {
        return loses;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    public int getChampionships() {
        return championships;
    }

    public void setChampionships(int championships) {
        this.championships = championships;
    }

    public int getArena_id() {
        return arena_id;
    }

    public void setArena_id(int arena_id) {
        this.arena_id = arena_id;
    }

    public List<Player> getPlayerList() {
        return DataSupport.where("team_id=?", String.valueOf(getBaseObjId())).find(Player.class);
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    /**
     * mapping the team information
     * @return
     */
    @Override
    public Map<String, Object> mapping() {
        return null;
    }
}
