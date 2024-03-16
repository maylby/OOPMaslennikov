package OOP.Lesson.Les04.Ex004.V3;

public class Program {
    public static void main(String[] args) {
        Repository<AudioContent> audioStorage = new Repository<>("audioStorage");
        audioStorage.add(new AudioContent("track_001.mp3"));
        audioStorage.add(new AudioContent("03 Дорожка 03.wma"));
        
        for (int index = 0; index < audioStorage.count(); index++) {
            System.out.println(audioStorage.get(index));
        }
        
        Repository<VideoContent> videoStorage = new Repository<>("videoStorage");
        videoStorage.add(new VideoContent("Новый фильм 1.wmv"));
        videoStorage.add(new VideoContent("Новый фильм 5.3gp")); 

        for (int index = 0; index < videoStorage.count(); index++) {
            System.out.println(videoStorage.get(index));
        }
        
        //#region проблема решена (???)
        /*
        * После сделанных обобщений "<T extends Content>" в "Repository"
        * поместить аудио контент в видео нельзя
        * и наоборот, видео нельзя поместить в аудио,
        * такое добавление (add) система запрещает
        * "add" подчёркивает красным
        */
        // audioStorage.add(new VideoContent("jfvjdhdf7768.mp4")); 
        // videoStorage.add(new AudioContent("Дорожка 005.wav")); 

        //#endregion

        //#region  проблема решена (???)
        /*
         * запись в репозитории заменена с <T> на <T extends Content>
         * P.S.
         * Несоответствие границ: тип String не является допустимой заменой 
         * ограниченного параметра <T расширяет содержимое> типа Repository<T>.
         * <String> - подчёркнут красным
         */
        // Repository<String> stringRepository = new Repository<>("stringRepository");
        // stringRepository.add("Кринж");
        // stringRepository.add("Краш");
        // stringRepository.add("Рофл");
        // stringRepository.add("Криповый");
        // stringRepository.add("Личинус");
        // stringRepository.add("Шеймить");
        // for (int i = 0; i < stringRepository.count(); i++) {
        //     System.out.println(stringRepository.get(i));
        // }
        //#endregion
    }
}

