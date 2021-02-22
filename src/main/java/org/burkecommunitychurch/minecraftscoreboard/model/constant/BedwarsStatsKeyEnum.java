package org.burkecommunitychurch.minecraftscoreboard.model.constant;

public enum BedwarsStatsKeyEnum {
    BEDS_DESTROYED("beds_destroyed"),
    CACHE_RANK("cache_rank"),
    DEATHS("deaths"),
    FINAL_KILLS("final_kills"),
    KILL_DEATH_RATIO("kd"),
    KILLS("kills"),
    LOSSES("loses"),
    PLAY_TIME("play_time"),
    RANK("rank"),
    ROUNDS_PLAYED("rounds_played"),
    WINS("wins"),
    WIN_LOSS("wl");

    private final String sqlKey;

    BedwarsStatsKeyEnum(String key) {
        this.sqlKey = key;
    }

    @Override
    public String toString() {
        return this.sqlKey;
    }
}
