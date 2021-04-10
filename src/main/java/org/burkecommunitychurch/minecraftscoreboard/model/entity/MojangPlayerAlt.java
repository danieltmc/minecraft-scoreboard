package org.burkecommunitychurch.minecraftscoreboard.model.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MojangPlayerAlt {
    private String code;
    private String message;
    private MojangPlayerAltData data;
    private Boolean success;

    @Entity
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    class MojangPlayerAltData {
        private MojangPlayerAltDataPlayer player;

        @Entity
        @NoArgsConstructor
        @AllArgsConstructor
        @Getter
        @Setter
        class MojangPlayerAltDataPlayer {
            private Meta meta;
            private String userName;
            private String id;
            private String raw_id;
            private String avatar;

            @Entity
            @NoArgsConstructor
            @AllArgsConstructor
            @Getter
            @Setter
            class Meta {
                private NameHistory name_history;

                @Entity
                @NoArgsConstructor
                @AllArgsConstructor
                @Getter
                @Setter
                class NameHistory {
                    private String name;
                    private Long changedToAt;
                }
            }
        }
    }

    public String getUserName() {
        return data.getPlayer().getUserName();
    }
}
