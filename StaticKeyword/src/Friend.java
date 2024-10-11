public class Friend {
    String name;
    static int nFriends;

    public Friend(String name) {
        this.name = name;
        Friend.nFriends++;
    }
}