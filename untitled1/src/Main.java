import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Main {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();

        // Настраиваем фильтр для отображения только определенных типов файлов
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Текстовые файлы", "txt");
        fileChooser.setFileFilter(filter);

        // Открываем проводник и ждем, пока пользователь выберет файл или нажмет кнопку "Отмена"
        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            // Пользователь выбрал файл
            java.io.File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Выбранный файл: " + selectedFile.getAbsolutePath());
        } else if (result == JFileChooser.CANCEL_OPTION) {
            // Пользователь нажал кнопку "Отмена"
            System.out.println("Отменено");
        }
    }
}
