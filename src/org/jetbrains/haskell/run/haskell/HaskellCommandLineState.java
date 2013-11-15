package org.jetbrains.haskell.run.haskell;

import com.intellij.execution.CantRunException;
import com.intellij.execution.ExecutionException;
import com.intellij.execution.configurations.CommandLineState;
import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.execution.configurations.JavaCommandLineStateUtil;
import com.intellij.execution.process.ProcessHandler;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.openapi.module.Module;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.haskell.compiler.GHCInterface;

import java.io.File;

final class HaskellCommandLineState extends CommandLineState {
    private final HaskellRunConfiguration configuration;

    HaskellCommandLineState(ExecutionEnvironment environment, HaskellRunConfiguration configuration) {
        super(environment);
        this.configuration = configuration;
    }


    @NotNull
    protected ProcessHandler startProcess() throws ExecutionException {
        return JavaCommandLineStateUtil.startProcess(createCommandLine());
    }

    private GeneralCommandLine createCommandLine() throws ExecutionException {
        GeneralCommandLine commandLine = new GeneralCommandLine();

        String exePath = GHCInterface.object$.getRunGHC();
        if (!new File(exePath).exists()) {
            throw new CantRunException("Cannot find runghc executable");
        }
        final Module module = configuration.getModule();
        File path = new File(module.getModuleFilePath());
        commandLine.setWorkDirectory(path.getParent());
        commandLine.setExePath(exePath);

        commandLine.addParameter(configuration.getMainFile());

        return commandLine;
    }
}