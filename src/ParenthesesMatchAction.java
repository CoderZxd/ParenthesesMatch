import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.psi.PsiFile;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: ParenthesesMatch
 * @Package PACKAGE_NAME
 * @description: TODO:一句话描述信息
 * @Version 1.0
 * @create 2019-05-04 19:08
 **/
public class ParenthesesMatchAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
        //获取当前在操作的工程上下文
        Project project = e.getData(PlatformDataKeys.PROJECT);
        //获取当前操作的类文件
        PsiFile psiFile = e.getData(CommonDataKeys.PSI_FILE);
        //获取当前类文件的路径
        String classPath = psiFile.getVirtualFile().getPath();
        String title = "Hello World!";
        //显示对话框
        Messages.showMessageDialog(project, classPath, title, Messages.getInformationIcon());
    }
}
