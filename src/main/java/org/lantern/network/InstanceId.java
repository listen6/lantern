package org.lantern.network;

public class InstanceId<U, F> {
    private U userId;
    private F fullId;

    public InstanceId(U userId, F fullId) {
        super();
        this.userId = userId;
        this.fullId = fullId;
    }

    public U getUserId() {
        return userId;
    }

    public F getFullId() {
        return fullId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((fullId == null) ? 0 : fullId.hashCode());
        result = prime * result
                + ((userId == null) ? 0 : userId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        InstanceId<?, ?> other = (InstanceId<?, ?>) obj;
        if (fullId == null) {
            if (other.fullId != null)
                return false;
        } else if (!fullId.equals(other.fullId))
            return false;
        if (userId == null) {
            if (other.userId != null)
                return false;
        } else if (!userId.equals(other.userId))
            return false;
        return true;
    }

}