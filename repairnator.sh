#!/usr/bin/env bash
java -cp repairnator-pipeline-3.3-SNAPSHOT-jar-with-dependencies.jar fr.inria.spirals.repairnator.pipeline.Launcher -l GIT_REPOSITORY  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 --repairTools NPEFix,AssertFixer,AstorJGenProg,AstorJKali,AstorJMut --gitrepo --gitrepourl https://github.com/sonukeshri/hackathon --gitrepobranch master -w /var/lib/jenkins/userContent/RepairnatorWorkspace