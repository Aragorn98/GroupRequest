package kz.iitu.jd3.bookrequest;

public class GroupRequest {

    private Long teacherId;
    private Group group
            ;

    public GroupRequest() {
    }

    public GroupRequest(Long teacherId, Group group) {
        this.teacherId = teacherId;
        this.group = group;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "GroupRequest{" +
                "teacherId='" + teacherId + '\'' +
                ", group=" + group +
                '}';
    }
}
