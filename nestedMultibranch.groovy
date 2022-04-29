folder('profox') {
    properties {
        templateConfigFolderProperty {
            tier {
                configurationProvider {
                    scmPipelineConfigurationProvider {
                        baseDir('pipeline-configuration')
                        scm {
                            gitSCM {
                              browser {}
                                userRemoteConfigs {
                                    userRemoteConfig {
                                        url('test.com')
                                        credentialsId('test')
                                      	refspec('')
                                      	name('')
                                    }
                                }
                                branches {
                                    branchSpec {
                                    name('*/test')
                                    }
                                }
                              gitTool('')
                            }
                        }
                    }
                }
            }
        }
    }
}
multibranchPipelineJob('profox/fox') {
    branchSources {
        branchSource {
            source {
                bitbucket {
                    serverUrl("bitbucket.com")
                    credentialsId("bitbucket creds")
                    repoOwner("profox")
                    repository("fox")
                    traits {
                        bitbucketBranchDiscovery {
                            strategyId(3)
                        }
                        headWildcardFilter {
                            includes("*JD*")
                          	excludes('')
                        }
                    }
                }
            }
        }
    }
    properties {
        templateConfigFolderProperty {
            tier {
                librarySources {
                    librarySource {
                        libraryProvider {
                            scmLibraryProvider {
                                baseDir('libraries')
                                scm {
                                    gitSCM {
                                      browser {}
                                        userRemoteConfigs {
                                            userRemoteConfig {
                                                url('test.com')
                                                credentialsId('test')
                                              	refspec('')
                                      			name('')
                                            }
                                        }
                                        branches {
                                            branchSpec {
                                                name('*/test')
                                            }
                                        }
                                      gitTool('')
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
