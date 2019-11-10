public class UserInterface {
    private static RoomService roomService =  new RoomService();
    private static WallpaperService wallpaperService = new WallpaperService();

    public static void main(String[] args) {
        Room roomNumber1 = new Room(5,6,2.75);
        Wallpaper wallpaperForRoomNumber1 = new Wallpaper(1.06, 10);
        calculateAll(roomNumber1, wallpaperForRoomNumber1);

        Room roomNumber2 = new Room(3,6.5,2.85);
        Wallpaper wallpaperForRoomNumber2 = new Wallpaper(1.06, 10, 0.6);
        calculateAll(roomNumber2, wallpaperForRoomNumber2);

        Room roomNumber3 = new Room(3.3,7.9,2.87);
        Wallpaper wallpaperForRoomNumber3 = new Wallpaper(1.01, 10.5, 0.32, 0.16);
        calculateAll(roomNumber3, wallpaperForRoomNumber3);

        Room roomNumber4 = new Room(-3.3,7.9,2.87);
        Wallpaper wallpaperForRoomNumber4 = new Wallpaper(1.01, 10.5, 0.32, 0.16);
        calculateAll(roomNumber4, wallpaperForRoomNumber4);

        Room roomNumber5 = new Room(-3.3,7.9,2.87);
        Wallpaper wallpaperForRoomNumber5 = new Wallpaper(1.01, 2.5, 1.32, 3.16);
        calculateAll(roomNumber5, wallpaperForRoomNumber5);
    }

    public static void calculateAll(Room room, Wallpaper wallpaper) {
        roomService.perimeter(room);
        wallpaperService.initialize(room, wallpaper);
    }
}
