interface Post {
    void display();
    void like();
}

class TextPost implements Post {
    public void display() {
        System.out.println("Displaying text content.");
    }

    public void like() {
        System.out.println("Liking text post.");
    }
}

class ImagePost implements Post {
    public void display() {
        System.out.println("Displaying image content.");
    }

    public void like() {
        System.out.println("Liking image post.");
    }
}

class VideoPost implements Post {
    public void display() {
        System.out.println("Displaying video content.");
    }

    public void like() {
        System.out.println("Liking video post.");
    }
}

public class Main {
    public static void main(String[] args) {
        Post[] posts = new Post[3];
        posts[0] = new TextPost();
        posts[1] = new ImagePost();
        posts[2] = new VideoPost();

        for (Post post : posts) {
            post.display();
            post.like();
        }
    }
}
