package org.burkecommunitychurch.minecraftscoreboard.model.constant;

public enum BedwarsStatsKeyEnum {
    BEDS_DESTROYED("bedwars:beds_destroyed"),
    CACHE_RANK("bedwars:cache_rank"),
    DEATHS("bedwars:deaths"),
    FINAL_KILLS("bedwars:final_kills"),
    KILL_DEATH_RATIO("bedwars:kd"),
    KILLS("bedwars:kills"),
    LOSSES("bedwars:loses"),
    PLAY_TIME("bedwars:play_time"),
    RANK("bedwars:rank"),
    ROUNDS_PLAYED("bedwars:rounds_played"),
    WINS("bedwars:wins"),
    WIN_LOSS("bedwars:wl");

    private final String sqlKey;

    BedwarsStatsKeyEnum(String key) {
        this.sqlKey = key;
    }

    @Override
    public BedwarsStatsKeyEnum fromValue(String value) {
        return new BedwarsStatsKeyEnum(value);
    }

    @Override
    public String toString() {
        return this.sqlKey;
    }
}
