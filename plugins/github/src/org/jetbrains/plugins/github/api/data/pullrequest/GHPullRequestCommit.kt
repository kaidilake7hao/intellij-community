// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package org.jetbrains.plugins.github.api.data.pullrequest

import org.jetbrains.plugins.github.api.data.GHCommit
import org.jetbrains.plugins.github.api.data.GHNode
import org.jetbrains.plugins.github.api.data.pullrequest.timeline.GHPRTimelineItem

class GHPullRequestCommit(id: String,
                          val commit: GHCommit,
                          val url: String)
  : GHNode(id), GHPRTimelineItem