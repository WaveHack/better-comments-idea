import com.intellij.lexer.JavaHighlightingLexer;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.pom.java.LanguageLevel;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

public class BetterCommentsSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey REGULAR_COMMENT = TextAttributesKey.createTextAttributesKey("REGULAR_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);

    public static final TextAttributesKey[] REGULAR_COMMENT_KEYS = new TextAttributesKey[]{REGULAR_COMMENT};

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new JavaHighlightingLexer(LanguageLevel.JDK_1_8);
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        return new TextAttributesKey[0];
    }

}
