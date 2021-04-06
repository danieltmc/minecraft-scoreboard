package org.burkecommunitychurch.minecraftscoreboard.model.constant;

import java.util.*;

public enum BedwarsStatsKeyEnum {
    BEDS_DESTROYED("bedwars:beds_destroyed", "BEDS_DESTROYED"),
    CACHE_RANK("bedwars:cache_rank", "CACHE_RANK"),
    DEATHS("bedwars:deaths", "DEATHS"),
    FINAL_KILLS("bedwars:final_kills", "FINAL_KILLS"),
    KILL_DEATH_RATIO("bedwars:kd", "KD"),
    KILLS("bedwars:kills", "KILLS"),
    LOSSES("bedwars:loses", "LOSSES"),
    PLAY_TIME("bedwars:play_time", "PLAY_TIME"),
    RANK("bedwars:rank", "RANK"),
    ROUNDS_PLAYED("bedwars:rounds_played", "ROUNDS_PLAYED"),
    WINS("bedwars:wins", "WINS"),
    WIN_LOSS("bedwars:wl", "WL");

    private final String sqlKey;
    private final String value;

    BedwarsStatsKeyEnum(String key, String value) {
        this.sqlKey = key;
        this.value = value;
    }

    public BedwarsStatsKeyEnum fromValue(String value) {
        return Arrays.stream(BedwarsStatsKeyEnum.values())
                .filter(bedwarsStatsKey -> bedwarsStatsKey.sqlKey.equalsIgnoreCase(value))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unexpected BedwarsStatsKeyEnum value '" + value + "'"));
    }

    public BedwarsStatsKeyEnum fromHumanReadable(String value) {
        return Arrays.stream(BedwarsStatsKeyEnum.values())
                .filter(bedwarsStatsKey -> bedwarsStatsKey.value.equalsIgnoreCase(value))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unexpected BedwarsStatsKeyEnum value '" + value + "'"));
    }

    @Override
    public String toString() {
        return this.value;
    }
}
