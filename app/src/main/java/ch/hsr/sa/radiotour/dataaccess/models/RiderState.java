package ch.hsr.sa.radiotour.dataaccess.models;

import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.LinkingObjects;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class RiderState extends RealmObject {
    @PrimaryKey
    private String id;
    @Required
    private String type;

    @LinkingObjects("ridersStates")
    private final RealmResults<RiderStageConnection> ridersStates = null;

    public RiderStateType getType() {
        return RiderStateType.valueOf(type);
    }

    public void setType(RiderStateType type) {
        this.type = type.toString();
    }
}